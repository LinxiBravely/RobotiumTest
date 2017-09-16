package com.coolwi.km.user.elements;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementsMyCard {
	private Solo solo;
	private RadioButton card_rb_1,card_rb_2,card_rb_3,card_rb_4;
	private TextView cadr_title_tv;//title 我的卡包
	private ImageView cadr_title_iv_f,cadr_title_iv;//返回,新增

	private ImageView list_item_redpacked_iv_fl;//图片
	private TextView  list_item_card_name;//店名
	private TextView list_item_card_hy;//
	private TextView list_item_card_money;//价格	
	public  ElementsMyCard(Solo solo){
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
			card_rb_1=(RadioButton)clickById("card_rb_1");
			card_rb_2=(RadioButton)clickById("card_rb_2");
			card_rb_3=(RadioButton)clickById("card_rb_3");
			card_rb_4=(RadioButton)clickById("card_rb_4");
			cadr_title_tv=(TextView)clickById("cadr_title_tv");
			cadr_title_iv_f=(ImageView)clickById("cadr_title_iv_f");
			cadr_title_iv=(ImageView)clickById("cadr_title_iv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  RadioButton getcard_rb_1() {
		return card_rb_1;
	}
	public  RadioButton getcard_rb_2() {
		return card_rb_2;
	}
	public  RadioButton getcard_rb_3() {
		return card_rb_3;
	}
	public  RadioButton getcard_rb_4() {
		return card_rb_4;
	}
	
	public TextView getcadr_title_tv () {
		return cadr_title_tv;		
	}
	public ImageView getcadr_title_iv_f() {
		return cadr_title_iv_f;
		
	}
	public ImageView getcadr_title_iv(){
		return cadr_title_iv;		
	}
	public ImageView  getlist_item_redpacked_iv_fl(){
		return list_item_redpacked_iv_fl;
		
	}
	public TextView getlist_item_card_name(){
		return list_item_card_name;	
	}
	public TextView getlist_item_card_hy(){
		return list_item_card_hy;
		
	}
	public TextView getlist_item_card_money(){
		return list_item_card_money;
		
	}
}
