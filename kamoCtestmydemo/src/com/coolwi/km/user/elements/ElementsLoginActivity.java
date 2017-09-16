package com.coolwi.km.user.elements;

import android.R;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coolwi.km.user.test.myOperationFun;
import com.robotium.solo.Solo;

public class ElementsLoginActivity {
	private Solo solo;
	private EditText login_numEditText,noteEditText;
	private Button bt_loginButton;
	private LinearLayout delete_numButton,login_ll_wexin;
	private TextView gain_note;
	
	public ElementsLoginActivity(Solo solo) {
		this.solo=solo;
	}
	
	/*private boolean clickById(String id) {  
        if(id==""){  
            return false;  
        }  
        try{  
            Activity act=solo.getCurrentActivity();//��ȡ��ǰActivity  
            int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//��ȡid  
            View view=solo.getView(id1);//�õ�View  
            solo.clickOnView(view);//���  
        }catch(Exception ex){  
            Log.e("Exception", ex.getMessage());  
        }  
        return true;  
    } */ 
		

		
	public View clickById(String id) throws Exception{  	    
		            Activity act=solo.getCurrentActivity();//��ȡ��ǰActivity  
		            int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//��ȡid  
		            View view=solo.getView(id1);//�õ�View  
		            return view;
		   //         solo.clickOnView(view);//���         
		    }  

		

	
	
	public void initViews(){
		
		try {
			login_numEditText=(EditText) clickById("login_numEditText");
			noteEditText=(EditText) clickById("noteEditText");
			delete_numButton=(LinearLayout) clickById("delete_num");
			bt_loginButton=(Button) clickById("bt_login");
			gain_note=(TextView) clickById("gain_note");
			login_ll_wexin=(LinearLayout) clickById("login_ll_wexin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*noteEditText=(EditText)solo.getCurrentActivity().findViewById(R.id.noteEditText);
		delete_numButton=(LinearLayout)solo.getCurrentActivity().findViewById(R.id.delete_num);
		bt_loginButton=(Button)solo.getCurrentActivity().findViewById(R.id.bt_login);
		gain_note=(TextView)solo.getCurrentActivity().findViewById(R.id.gain_note);
		login_ll_wexin=(LinearLayout)solo.getCurrentActivity().findViewById(R.id.login_ll_wexin);	*/
	}
	


	
	public EditText getlogin_numEditText(){
		return login_numEditText;	
	}

			
	public EditText getnoteEditText() {
		return noteEditText;	
	}
	

	public LinearLayout getdelete_numButton(){
		return delete_numButton;
	}

	public Button getbt_loginButton() {
		return bt_loginButton;
		
	}
	

	public void enterlogin_num(String text) {
		solo.enterText(login_numEditText, text);
	}

	public  void enternote(String text) {
		solo.enterText(noteEditText, text);
	}
	
	public void enterbt_loginButton(){
		solo.clickOnView(bt_loginButton);
	}
	

	public void clickdelete_numButton(){
		solo.clickOnView(delete_numButton);
	}
	

	public void clickgain_note() {
		solo.clickOnView(gain_note);
	}

	public void clicklogin_ll_wexin() {
		solo.clickOnView(login_ll_wexin);
	}
	
	

	private void clickbt_loginButton() {
		// TODO Auto-generated method stub
		solo.clickOnView(bt_loginButton);

	}
}
