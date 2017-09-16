package com.coolwi.km.user.elements;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementMyCardRecord {
	private Solo solo;
	private ImageView transaction_title_iv_f;
	private TextView transaction_title_tv;
	private TextView list_item_record_tv_balance;
	private TextView list_item_record_tv_name;
	
	private ImageView title_iv_f;
	private TextView title;
	private TextView record_guid1;
	private TextView record_guid2;
	private TextView record_guid3;
	private TextView record_guid4;
	private TextView record_guid5;
	
	public ElementMyCardRecord(Solo solo){
		this.solo=solo;
	}
	public View clickById(String id) throws Exception{  	    
	    Activity act=solo.getCurrentActivity();//ï¿½ï¿½È¡ï¿½ï¿½Ç°Activity  
	    int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//ï¿½ï¿½È¡id  
	    View view=solo.getView(id1);//ï¿½Ãµï¿½View  
	    return view;
	} 
	
	public void initView(){
		try {
			transaction_title_iv_f=(ImageView)clickById("transaction_title_iv_f");//·µ»Ø
			transaction_title_tv=(TextView)clickById("transaction_title_tv");//title
			list_item_record_tv_balance=(TextView)clickById("list_item_record_tv_balance");//½ð¶î
			list_item_record_tv_name=(TextView)clickById("list_item_record_tv_name");//µêÆÌÃû³Æ	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void initViewMyRecord(){
		try {
			title_iv_f=(ImageView)clickById("title_iv_f");
			title=(TextView)clickById("title");
			record_guid1=(TextView)clickById("record_guid1");
			record_guid2=(TextView)clickById("record_guid2");
			record_guid3=(TextView)clickById("record_guid3");
			record_guid4=(TextView)clickById("record_guid4");
			record_guid5=(TextView)clickById("record_guid5");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ImageView gettitle_iv_f(){
		return transaction_title_iv_f;
		
	}
	public TextView gettitle(){
		return title;
		
	}
	public TextView getrecord_guid1(){
		return record_guid1;
		
	}
	public TextView getrecord_guid2(){
		return record_guid2;
		
	}
	public TextView getrecord_guid3(){
		return record_guid3;
		
	}
	public TextView getrecord_guid4(){
		return record_guid4;
		
	}
	public TextView getrecord_guid5(){
		return record_guid5;
		
	}
	public TextView getlist_item_record_tv_balance(){
		return list_item_record_tv_balance;
		
	}
	public TextView gettransaction_title_tv(){
		return transaction_title_tv;
		
	}
	public ImageView gettransaction_title_iv_f(){
		return transaction_title_iv_f;
		
	}
	public TextView getlist_item_record_tv_name() {
		return list_item_record_tv_name;
		
	}
	
}
