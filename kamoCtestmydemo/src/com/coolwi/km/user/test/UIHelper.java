package com.coolwi.km.user.test;

import com.coolwi.km.user.elements.ElementMyCardRecord;
import com.coolwi.km.user.elements.ElementMycardMyImforActivity;
import com.coolwi.km.user.elements.ElementMycarduserAcitvity;
import com.coolwi.km.user.elements.ElementsLoginActivity;
import com.coolwi.km.user.elements.ElementsMyCard;
import com.robotium.solo.Solo;

public class UIHelper {
	private Solo solo=null;
	private ElementsLoginActivity ElementsLoginActivity;
	private ElementMycarduserAcitvity ElementMycarduserAcitvity;
	private ElementsMyCard ElementsMyCard;
	private ElementMycardMyImforActivity ElementMycardMyImforActivity;
	private ElementMyCardRecord ElementMyCardRecord;
	
	public UIHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public UIHelper(Solo solo){
		this.solo=solo;
	}
	public Solo getsolo(){
		return solo;	
	}
	
	
	public ElementsLoginActivity getElementsLoginActivity() {
		if(ElementsLoginActivity==null){
			ElementsLoginActivity=new ElementsLoginActivity(solo);
		}
		ElementsLoginActivity.initViews();
		
		return ElementsLoginActivity;
		
	}
	public ElementMycarduserAcitvity getElementMycarduserAcitvity(){
		if(ElementMycarduserAcitvity==null){
			ElementMycarduserAcitvity=new ElementMycarduserAcitvity(solo);
		}
		ElementMycarduserAcitvity.initView();
		return ElementMycarduserAcitvity;
	}
	public ElementsMyCard getElementsMyCard(){
		if(ElementsMyCard==null){
			ElementsMyCard=new ElementsMyCard(solo);
		}
		ElementsMyCard.initView();
		return ElementsMyCard;
	}
	public ElementMycardMyImforActivity getElementMycardMyImforActivity(){
		if(ElementMycardMyImforActivity==null){
			ElementMycardMyImforActivity=new ElementMycardMyImforActivity(solo);
		}
		ElementMycardMyImforActivity.initView();
		ElementMycardMyImforActivity.initViewMyName();
		ElementMycardMyImforActivity.initViewMyEmail();
		return ElementMycardMyImforActivity;
	}
	public ElementMyCardRecord getElementMyCardRecord(){
		if(ElementMyCardRecord==null){
			ElementMyCardRecord=new ElementMyCardRecord(solo);
		}
		ElementMyCardRecord.initView();
		return ElementMyCardRecord;
		
	}
	
}