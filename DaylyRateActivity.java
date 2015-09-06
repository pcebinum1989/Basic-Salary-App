package promise.basicsalarycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DaylyRateActivity extends AppCompatActivity {
    CalculateRate mCalculateRate = new CalculateRate();

    private EditText mYearlyTextInput;
    private EditText mMonthlyTextView;
    private EditText mWeeklyTextView;
    private EditText mDaylyTextView;
    private EditText mTotalRate;
    private Button mCalculateButton;
    private Button mClearButton;
    private Button mRateButton;
    private Button mYearButton;
    private Button mMonthButton;
    private Button mWeekButton;
    private Button mDayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dayly_rate);
    }

    public void onButtonClick(View v) {
        mYearlyTextInput = (EditText) findViewById(R.id.yearlyTextInput);
        mMonthlyTextView = (EditText) findViewById(R.id.monthlyTextView);
        mWeeklyTextView = (EditText) findViewById(R.id.weeklyTextView);
        mDaylyTextView = (EditText) findViewById(R.id.daylyTextView);
        mTotalRate = (EditText) findViewById(R.id.totalRate);
        mCalculateButton = (Button) findViewById(R.id.calculateButton);
        mClearButton = (Button) findViewById(R.id.clearButton);
        mRateButton = (Button) findViewById(R.id.rateView);
        mYearButton = (Button) findViewById(R.id.yearlyView);
        mMonthButton = (Button) findViewById(R.id.monthlyView);
        mWeekButton = (Button) findViewById(R.id.weeklyView);
        mDayButton = (Button) findViewById(R.id.daylyView);


        if (v == mCalculateButton) {

            if (mDaylyTextView.getText().toString().trim().length() == 0) {
                String message = "You Must Enter Correct Dayly Rate";
                Toast Stop = Toast.makeText(this, message, Toast.LENGTH_LONG);
                Stop.show();
            } else {
                float yearlyrate, monthlyrate, weeklyrate, daylyrate, rate;
                daylyrate = Float.valueOf(mDaylyTextView.getText().toString());

                rate = daylyrate / mCalculateRate.HOURS_IN_A_DAY;
                monthlyrate = rate * mCalculateRate.WEEKS_IN_A_MONTH * mCalculateRate.HOURS_IN_A_WEEK;
                weeklyrate = rate * mCalculateRate.HOURS_IN_A_WEEK;
                daylyrate = rate * mCalculateRate.HOURS_IN_A_DAY;
                yearlyrate = rate * mCalculateRate.WEEKS_IN_A_YEAR * mCalculateRate.HOURS_IN_A_WEEK;

                mYearlyTextInput.setText(Float.toString(yearlyrate));
                mMonthlyTextView.setText(Float.toString(monthlyrate));
                mWeeklyTextView.setText(Float.toString(weeklyrate));
                mDaylyTextView.setText(Float.toString(daylyrate));
                mTotalRate.setText(Float.toString(rate));
            }
            if (v == mClearButton) {
                onClick(mClearButton);
            }
            if (v == mYearButton) {
                onClickYear(mYearButton);
            }
            if (v == mMonthButton) {
                onClickMonth(mMonthButton);
            }
            if (v == mDayButton) {
                onClickDay(mDayButton);
            }
            if (v == mRateButton) {
                onClickRate(mRateButton);
            }
            if (v == mWeekButton) {
                onClickWeek(mWeekButton);
            }
        }
    }

    public void onClick(View v) {
        mCalculateButton = (Button) findViewById(R.id.calculateButton);
        mClearButton = (Button) findViewById(R.id.clearButton);
        EditText cYearlyView = (EditText) findViewById(R.id.yearlyTextInput);
        EditText cMonthlyView = (EditText) findViewById(R.id.monthlyTextView);
        EditText cWeeklyView = (EditText) findViewById(R.id.weeklyTextView);
        EditText cDaylyView = (EditText) findViewById(R.id.daylyTextView);
        EditText cRateView = (EditText) findViewById(R.id.totalRate);

        if (v == mClearButton) {
            cYearlyView.setText("");
            cMonthlyView.setText("");
            cWeeklyView.setText("");
            cDaylyView.setText("");
            cRateView.setText("");
        }
    }

    public void onClickYear(View v) {
        mYearButton = (Button) findViewById(R.id.yearlyView);

        if (v == mYearButton) {
            Intent yearlyintent = new Intent(this, YearlyRateActivity.class);
            startActivity(yearlyintent);
        }
    }

    public void onClickMonth(View v) {
        mMonthButton = (Button) findViewById(R.id.monthlyView);

        if (v == mMonthButton) {
            Intent monthlyintent = new Intent(this, MonthlyRateActivity.class);
            startActivity(monthlyintent);
        }
    }

    public void onClickWeek(View v) {
        mWeekButton = (Button) findViewById(R.id.weeklyView);

        if (v == mWeekButton) {
            Intent weeklyintent = new Intent(this, WeeklyRateActivity.class);
            startActivity(weeklyintent);
        }
    }

    public void onClickDay(View v) {
        mDayButton = (Button) findViewById(R.id.daylyView);

        if (v == mDayButton) {
            Intent daylyintent = new Intent(this, DaylyRateActivity.class);
            startActivity(daylyintent);
        }
    }

    public void onClickRate(View v) {
        mRateButton = (Button) findViewById(R.id.rateView);

        if (v == mRateButton) {
            Intent rateintent = new Intent(this, Salary.class);
            startActivity(rateintent);
        }
    }
}
