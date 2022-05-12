package com.company;

public class Student {
    Activity activity;
    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleeping)
        {
            setActivity(new Skips());
        }
        else if (activity instanceof Skips)
        {
            setActivity(new Coding());
        }
        else if (activity instanceof Coding)
        {
            setActivity(new Sleeping());
        }
    }
    public void Execution(){
        activity.Execution();
    }
}
