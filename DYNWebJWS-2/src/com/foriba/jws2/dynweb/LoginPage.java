package com.foriba.jws2.dynweb;

import org.apache.commons.lang3.StringUtils;

/*import com.fit.earsiv.core.jpa.service.GeneralParamService;
import com.fit.earsiv.util.CryptoUtil;
import com.fit.earsiv.util.parameters.RuntimeParams;
import com.fit.earsiv.web.model.WebUser;
import com.fit.earsiv.web.service.ServiceLocator; */

public class LoginPage extends AbstractPage {

	private static final long serialVersionUID = 4066303450701564629L;
	public static final String AUTH_KEY = "auth.login.success";


	private WebUser webUser;
	private boolean isLoggedIn;
	private String loginMessage;
	
	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	
	public LoginPage(){
		webUser= new WebUser();
	}

	public String login() throws Exception {
		if (webUser.getUsername().equals("product")&& webUser.getPassword().equals("product")) {
            isLoggedIn = true;
            storeOnSession(AUTH_KEY, webUser);
            setLoginMessage("Success");
            return "loginSuccess";
            
        }    
        setLoginMessage("Invalid credentials");
        return null;        
    }


	public String getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	public WebUser getWebUser() {
		return webUser;
	}

	public void setWebUser(WebUser webUser) {
		this.webUser = webUser;
	}

}
