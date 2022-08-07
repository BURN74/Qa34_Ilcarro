package tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

    @Test
    public void searchCurrentMonth() {
        app.search().searchCurrentMonth("Tel Aviv", "8/5/2022", "8/4/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListOfCarsAppeared());
        app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen1.png");

    }
    @Test
    public void searchNextMonth() {
        app.search().searchNextMonth("Tel Aviv - Jaffo", "9/28/2022", "9/27/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListOfCarsAppeared());
        app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen2.png");

    }


    @Test
    public void searchPeriodPast(){
        app.search().searchPeriodPast("Rehovot","2/10/2022","3/15/2022");
        app.search().submitWithoutWait();
        Assert.assertTrue(app.search().isYallaButtoNotActive());
        Assert.assertTrue(app.search().isPeriodInPast());
        //app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen3.png");

    }

    @Test
    public void searchCurrentYear() {
        app.search().searchCurrentYear("Haifa", "8/10/2022", "8/20/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListOfCarsAppeared());
        Assert.assertTrue(app.search().isPageResultAppeared());
        app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen4.png");
    }


    @Test
    public void searchCurrentYearLocalDate(){
        app.search().searchCurrentYearLocalDate("Jerusalem", "8/10/2022", "10/20/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListOfCarsAppeared());
        app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen5.png");
    }
    @Test(groups = {"web"})
    public void searchAnyPeriod(){
        app.search().searchAnyPeriodLocalDate2("Haifa", "6/10/2023", "7/15/2023");
        app.search().submit();
        Assert.assertTrue(app.search().isListOfCarsAppeared());
        app.search().takeScreenShots("C:\\Users\\97253\\Qa34\\Qa34_Ilcarro\\src\\test\\screenshots\\screen6 .png");
    }


    @BeforeMethod (alwaysRun = true)
    public void returnToHome(){
        app.search().returnToHome();
    }
}
