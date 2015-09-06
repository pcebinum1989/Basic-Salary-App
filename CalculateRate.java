package promise.basicsalarycalculator;

/**
 * Created by Promise on 8/25/2015.
 */
public class CalculateRate {

    public static float WEEKS_IN_A_YEAR = 52;
    public static float HOURS_IN_A_WEEK = 40;
    public static float WEEKS_IN_A_MONTH = (float) 4.3;
    public static float HOURS_IN_A_DAY = 8;
    public static float MONTH_VARIABLE = (float) 12.1;
    private float mYearlySalary;
    private float mMonthlySalary;
    private float mWeeklySalary;
    private float mDaylySalary;
    private float mRate;


    public void setYearlySalary(float yearlysalary){
        mYearlySalary = yearlysalary;
    }

    public void setMonthlySalary(float monthlysalary){
        mMonthlySalary = monthlysalary;
    }

    public void setWeeklySalary(float weeklysalary){
        mWeeklySalary = weeklysalary;
    }

    public void setDaylySalary(float daylysalary){
        mDaylySalary = daylysalary;
    }

    public void setRate(float rate){
        mRate = rate;
    }

    public float getYearlySalary(){
        return mYearlySalary;
    }

    public float getMonthlySalary(){
        return mMonthlySalary;
    }

    public float getWeeklySalary(){
        return mWeeklySalary;
    }

    public float getDaylySalary(){
        return mDaylySalary;
    }

    public float getRate(){
        return mRate;
    }

    //Overloaded Constructor
    public CalculateRate(){
    }

    public double CalculateYearly( float rate){
        return rate * WEEKS_IN_A_YEAR * HOURS_IN_A_WEEK;
    }

    public double CalculateRately( float yearlyRate){
        return yearlyRate / WEEKS_IN_A_YEAR / HOURS_IN_A_WEEK;
    }

    public double CalculateMonthly( float rate){
        return rate * WEEKS_IN_A_MONTH * HOURS_IN_A_WEEK;
    }

    public double CalculateWeekly(float rate){
        return rate *  HOURS_IN_A_WEEK;
    }

    public double CalculatDayly(float rate){
        return rate *  HOURS_IN_A_DAY;
    }
}
