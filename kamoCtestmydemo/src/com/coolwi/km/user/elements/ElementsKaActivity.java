package com.coolwi.km.user.elements;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementsKaActivity {
	private Solo solo;
	private RadioButton card_rb_1,card_rb_2,card_rb_3,card_rb_4;
	private ImageView list_item_frament_icon;// 图片
	private TextView list_item_frament_name;// 店名
	private TextView list_item_frament_type;// 类型
	private TextView list_item_frament_distance;// 距离
	
	private Button main_fragment_city;
	private Button main_news1;
	public ElementsKaActivity(Solo solo) {
		this.solo=solo;
		// TODO Auto-generated constructor stub
	}

	public View clickById(String id) throws Exception{  	    
	            Activity act=solo.getCurrentActivity();//��ȡ��ǰActivity  
	            int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//��ȡid  
	            View view=solo.getView(id1);//�õ�View  
	            return view;
	   //         solo.clickOnView(view);//���         
	    }  
	private void initview() {
		// TODO Auto-generated method stub
		try {
			card_rb_1=(RadioButton)clickById("card_rb_1");
			card_rb_2=(RadioButton)clickById("card_rb_2");
			card_rb_3=(RadioButton)clickById("card_rb_3");
			card_rb_4=(RadioButton)clickById("card_rb_4");	
			list_item_frament_icon=(ImageView)clickById("list_item_frament_icon");	
			list_item_frament_name=(TextView)clickById("list_item_frament_name");
			list_item_frament_type=(TextView)clickById("list_item_frament_type");
			list_item_frament_distance=(TextView)clickById("list_item_frament_distance");
			
			main_fragment_city=(Button)clickById("main_city");
			main_news1=(Button)clickById("main_news1");
			
			
			ListView main_lv=(ListView)clickById("main_lv");
			main_lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					
					
				}
			});
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public RadioButton getcard_rb_1() {
		return card_rb_1;
	}
	public RadioButton getcard_rb_2() {
		return card_rb_2;	
	}
	public RadioButton getcard_rb_3() {
		return card_rb_3;	
	}
	public RadioButton getcard_rb_4() {
		return card_rb_4;	
	}
	public ImageView getlist_item_frament_icon() {
		return list_item_frament_icon;
	}
	
	public Button getmain_fragment_city() {
		return main_fragment_city;
	}
	public Button getmain_news1() {
		return main_news1;
	
	}
	public void clickcard_rb_1() {
		solo.clickOnView(card_rb_1);
	}
	public void clickcard_rb_2() {
		solo.clickOnView(card_rb_2);
	}
	public void clickcard_rb_3() {
		solo.clickOnView(card_rb_3);
	}
	public void clickcard_rb_4() {
		solo.clickOnView(card_rb_4);
	}
	public void clicklist_item_frament_icon() {
		solo.clickOnView(list_item_frament_icon);
	}
	public void clickgetmain_fragment_city() {
		solo.clickOnView(list_item_frament_icon);
	}
	public void clickgetmain_news1() {
		solo.clickOnView(main_news1);
	}
	
}
