package TestCases.Login;

import PageObject.Login._003_MyProfile;
import org.testng.annotations.Test;

public class TC_003_MyProfile extends _003_MyProfile {

    @Test
    public void ValidateMyProfileOption(){
        ValidatingMyProfileButton();
    }
}
