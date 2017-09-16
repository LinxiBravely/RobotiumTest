package com.coolwi.km.user.elements;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementShopHomeActivity {
	private Solo solo;
	public ElementShopHomeActivity(Solo solo){
		this.solo=solo;
	}
	private EditText et_search,add_title_tv_sao;//搜索框，城市
	private TextView add_pop_1_tv,add_pop_2_tv,add_pop_3_tv;//行业、商圈、距离优先
	private TextView list_item_frament_name;//城市名称
	
	public View clickById(String id) throws Exception{  	    
        Activity act=solo.getCurrentActivity();//锟斤拷取锟斤拷前Activity  
        int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//锟斤拷取id  
        View view=solo.getView(id1);//锟矫碉拷View  
        return view;
//         solo.clickOnView(view);//锟斤拷锟�        
}  
	public void initView() {
		// TODO Auto-generated method stub
		try {
			et_search=(EditText)clickById("et_search");
			add_title_tv_sao=(EditText)clickById("add_title_tv_sao");
			add_pop_1_tv=(TextView)clickById("add_pop_1_tv");
			add_pop_2_tv=(TextView)clickById("add_pop_2_tv");
			add_pop_3_tv=(TextView)clickById("add_pop_3_tv");
			list_item_frament_name=(TextView)clickById("list_item_frament_name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public EditText getet_search() {
		return et_search;		
	}
	public EditText getadd_title_tv_sao() {
		return add_title_tv_sao;	
	}
	public TextView getadd_pop_1_tv() {
		return add_pop_1_tv;
		
	}
	public TextView getadd_pop_2_tv() {
		return add_pop_2_tv;
	}
	public TextView getadd_pop_3_tv() {
		return add_pop_3_tv;
	}
	public TextView getlist_item_frament_name() {
		return list_item_frament_name;	
	}
}
