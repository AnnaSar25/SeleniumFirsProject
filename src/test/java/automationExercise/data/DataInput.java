package automationExercise.data;

import org.testng.annotations.DataProvider;

public class DataInput {
    @DataProvider(name = "loginData")
    public  Object[][] loginData() {
        return new Object[][]{
                {
                        "Anna", "aa@test","error message"
                },

                {"12345", "asjak@test.com","error message"

                },
                {
                        "Slava", "slava@test.com"
                },
                {
                        "Slava", "slava@test.com"," Email Address already exist!"

                }
        };
    }

    @DataProvider(name = "signUpData")
    public  Object[][] signUpData() {
        return new Object[][]{
                {
                        "Anna", "aa@test"
                },

                {"12345", "asjak@test.com"
                },
                {
                        "Slava", "slava@test.com"
                }
        };
    }


}
