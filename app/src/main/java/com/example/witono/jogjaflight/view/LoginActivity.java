package com.example.witono.jogjaflight.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.di.InjectableActivity;
import com.example.witono.jogjaflight.interfaces.CallInterface;
import com.example.witono.jogjaflight.model.LoginResponse;
import com.example.witono.jogjaflight.network.SiakadService;
import com.example.witono.jogjaflight.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.paperdb.Paper;

public class LoginActivity extends BaseApp implements CallInterface,InjectableActivity{

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    @Inject
    public SiakadService siakadService;

    @BindView(R.id.input_email)
    EditText _emailText;
    @BindView(R.id.input_password) EditText _passwordText;
    @BindView(R.id.btn_login) Button _loginButton;
    private LoginPresenter presenter;
    private ProgressDialog progressDialog;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Paper.exist("user") ){
            LoginResponse l = Paper.book().read("user");
            Common.User = l;
            finish();

        }
        getDeps().inject(this);
        setContentView(R.layout.activity_login);


        ButterKnife.bind(this);
        presenter = new LoginPresenter(this, siakadService);
        _loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        });
        progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog);

    }

    public void login() {
        Log.d(TAG, "Login");

        if (!validate()) {
            Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
            _loginButton.setEnabled(true);
            return;
        }

        _loginButton.setEnabled(false);


        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();
        Log.d(TAG,email);

        // TODO: Implement your own authentication logic here.

        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();
      presenter.login(email,password);
//        new android.os.Handler().postDelayed(
//                new Runnable() {
//                    public void run() {
//                        // On complete call either onLoginSuccess or onLoginFailed
//                        onLoginSuccess();
//                        // onLoginFailed();
//                        progressDialog.dismiss();
//                    }
//                }, 3000);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_SIGNUP) {
            if (resultCode == RESULT_OK) {

                // TODO: Implement successful signup logic here
                // By default we just finish the Activity and log them in automatically
                this.finish();
            }
        }
    }

    @Override
    public void onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true);
    }


    public boolean validate() {
        boolean valid = true;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty()) {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        return valid;
    }

    @Override
    public void onCallSucces(String messages) {
        progressDialog.dismiss();
        _loginButton.setEnabled(true);
        Paper.book().write("user",Common.User);
        //one time login


        finish();
    }

    @Override
    public void onCallFailure(String messages) {
        progressDialog.dismiss();
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
        _loginButton.setEnabled(true);
    }


}
