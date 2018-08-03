package com.example.witono.jogjaflight.view;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.R;
import com.example.witono.jogjaflight.common.Common;
import com.example.witono.jogjaflight.interfaces.TableCall;
import com.example.witono.jogjaflight.model.Jadwal;
import com.example.witono.jogjaflight.model.KolomTabelKHS;
import com.example.witono.jogjaflight.model.Nilai;
import com.example.witono.jogjaflight.presenter.TabelKHSPresenter;
import com.example.witono.jogjaflight.presenter.TablePresenter;
import com.example.witono.jogjaflight.repository.SiakadRepository;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class TabelKHSActivity extends BaseApp implements TableCall {
    private TableLayout mTableLayout;
    ProgressDialog mProgressBar;
    private List<Nilai> nilai = new ArrayList<>();
    private TablePresenter presenter;


    @Inject
    public SiakadRepository repository;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_row);
        getDeps().inject(this);
        int term = getIntent().getIntExtra("term",1);

        presenter = new TablePresenter(this,repository);
        mProgressBar = new ProgressDialog(this);


        // setup the table

        mTableLayout = (TableLayout) findViewById(R.id.tableInvoices);
        mTableLayout.setStretchAllColumns(true);
        presenter.getTableKhs(Integer.parseInt("20"+Common.User.getUsername().substring(3,5)),term,Common.User.getId_users());
        startLoadData();
    }
    public void startLoadData() {
        mProgressBar.setCancelable(false);
        mProgressBar.setMessage("Menampilkan..");
        mProgressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressBar.show();

    }
    public void loadData(List<Nilai> data) {
        int leftRowMargin=0;
        int topRowMargin=0;
        int rightRowMargin=0;
        int bottomRowMargin = 0;
        int textSize = 0, smallTextSize =0, mediumTextSize = 0;

        textSize = (int) getResources().getDimension(R.dimen.font_size_verysmall);
        smallTextSize = (int) getResources().getDimension(R.dimen.font_size_small);
        mediumTextSize = (int) getResources().getDimension(R.dimen.font_size_medium);

        TabelKHSPresenter tabelJadalPresenter = new TabelKHSPresenter();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int rows = data.size();


        TextView textSpacer = null;
        mTableLayout.removeAllViews();
        // -1 means heading row

        for(int i = -1; i < rows; i ++) {
            Nilai row = null;
            if (i > -1)
                row = data.get(i);
            else {
                textSpacer = new TextView(this);
                textSpacer.setText("");
            }

            // data columns

            final TextView tv = new TextView(this);
            tv.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,

                    TableRow.LayoutParams.WRAP_CONTENT));

            tv.setGravity(Gravity.CENTER);
            tv.setPadding(5, 15, 0, 15);

            if (i == -1) {
                tv.setText("Nama MataKUliah");
                tv.setBackgroundColor(Color.parseColor("#f97d1f"));
                tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, smallTextSize);
            } else {
                tv.setBackgroundColor(Color.parseColor("#f8f8f8"));
                tv.setText(String.valueOf(row.getNama_makul()));
                tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
            }


            final TextView tv2 = new TextView(this);
            if (i == -1) {
                tv2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.WRAP_CONTENT));
                tv2.setTextSize(TypedValue.COMPLEX_UNIT_PX, smallTextSize);
            } else {
                tv2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.MATCH_PARENT));
                tv2.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
            }
            tv2.setGravity(Gravity.CENTER);
            tv2.setPadding(5, 15, 0, 15);
            if (i == -1) {

                tv2.setText("SKS");
                tv2.setBackgroundColor(Color.parseColor("#fd9241"));
            }else {
                tv2.setBackgroundColor(Color.parseColor("#ffffff"));
                tv2.setTextColor(Color.parseColor("#000000"));
                tv2.setText(row.getSks());
            }

            final LinearLayout layCustomer = new LinearLayout(this);
            layCustomer.setOrientation(LinearLayout.VERTICAL);
            layCustomer.setBackgroundColor(Color.parseColor("#f8f8f8"));

            final TextView tv3 = new TextView(this);

            if (i == -1) {
                tv3.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.MATCH_PARENT));
                tv3.setPadding(5, 5, 0, 5);
                tv3.setTextSize(TypedValue.COMPLEX_UNIT_PX, smallTextSize);

            } else {
                tv3.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.MATCH_PARENT));
                tv3.setPadding(5, 0, 0, 5);
                tv3.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
            }
            tv3.setGravity(Gravity.CENTER);
            tv3.setPadding(5, 15, 0, 15);
            if (i == -1) {
                tv3.setText("Nilai");
                tv3.setBackgroundColor(Color.parseColor("#f97d1f"));
            } else {
                tv3.setBackgroundColor(Color.parseColor("#f8f8f8"));
                tv3.setTextColor(Color.parseColor("#000000"));
                tv3.setTextSize(TypedValue.COMPLEX_UNIT_PX, smallTextSize);
                tv3.setText(row.getGrade());

            }
            layCustomer.addView(tv3);
            if (i > -1) {
                final TextView tv3b = new TextView(this);
                tv3b.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));
                tv3b.setGravity(Gravity.RIGHT);
                tv3b.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
                tv3b.setPadding(5, 1, 0, 5);
                tv3b.setTextColor(Color.parseColor("#aaaaaa"));
                tv3b.setBackgroundColor(Color.parseColor("#f8f8f8"));
                layCustomer.addView(tv3b);
            }

            // add table row
            final TableRow tr = new TableRow(this);
            tr.setId(i + 1);
            TableLayout.LayoutParams trParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT);
            trParams.setMargins(leftRowMargin, topRowMargin, rightRowMargin, bottomRowMargin);
            tr.setPadding(0,0,0,0);
            tr.setLayoutParams(trParams);
            tr.addView(tv);
            tr.addView(tv2);
            tr.addView(layCustomer);

            if (i > -1) {
                tr.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        TableRow tr = (TableRow) v;
                        //do whatever action is needed
                    }

                });

            }

            mTableLayout.addView(tr, trParams);

            if (i > -1) {
                // add separator row
                final TableRow trSep = new TableRow(this);

                TableLayout.LayoutParams trParamsSep = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
                        TableLayout.LayoutParams.WRAP_CONTENT);
                trParamsSep.setMargins(leftRowMargin, topRowMargin, rightRowMargin, bottomRowMargin);

                trSep.setLayoutParams(trParamsSep);

                TextView tvSep = new TextView(this);
                TableRow.LayoutParams tvSepLay = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.WRAP_CONTENT);

                tvSepLay.span = 3;
                tvSep.setLayoutParams(tvSepLay);
                tvSep.setBackgroundColor(Color.parseColor("#d9d9d9"));
                tvSep.setHeight(1);
                trSep.addView(tvSep);

                mTableLayout.addView(trSep, trParamsSep);
            }
        }
    }

    @Override
    public void onSucces(List data) {

        nilai = (List<Nilai>) data;
        loadData(nilai);
        mProgressBar.hide();

    }

    @Override
    public void onFailure(String messages) {
        Log.d("messages",messages);

        mProgressBar.hide();

    }



}