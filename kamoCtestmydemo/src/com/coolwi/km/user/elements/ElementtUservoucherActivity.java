package com.coolwi.km.user.elements;



import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coolwi.km.user.test.myOperationFun;
import com.robotium.solo.Solo;

public class ElementtUservoucherActivity {
	private Solo solo;
	private myOperationFun myOperationFun;
	private LinearLayout kb2_zz_ll;//转赠
	private TextView kb2_sy_ll;//使用
	private ImageView cadr_title_iv;//历史
	private ImageView cadr_title_iv_f;//返回
	public ElementtUservoucherActivity(Solo solo){
		this.solo=solo;
	}
	public View clickById(String id) throws Exception{  	    
        Activity act=solo.getCurrentActivity();//锟斤拷取锟斤拷前Activity  
        int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//锟斤拷取id  
        View view=solo.getView(id1);//锟矫碉拷View  
        return view;
//         solo.clickOnView(view);//锟斤拷锟�        
} 
	public void initView(){
		try {
			kb2_zz_ll=(LinearLayout)clickById("kb2_zz_ll"); 
			kb2_sy_ll=(TextView)clickById("kb2_sy_ll");
			cadr_title_iv=(ImageView)clickById("cadr_title_iv");
			cadr_title_iv_f=(ImageView)clickById("cadr_title_iv_f");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public LinearLayout getkb2_zz_ll(){
		return kb2_zz_ll;
		
	}
	public TextView kb2_sy_ll(){
		return kb2_sy_ll;
		
	}
	public ImageView getcadr_title_iv(){
		return cadr_title_iv;
		
	}
	public ImageView getcadr_title_iv_f(){
		return cadr_title_iv_f;
		
	}
}
