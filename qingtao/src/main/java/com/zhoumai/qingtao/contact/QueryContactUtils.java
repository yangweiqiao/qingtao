package com.zhoumai.qingtao.contact;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class QueryContactUtils {

	//查询联系人的业务方法
	public static List<Contact> queryContact(Context context){
		
		List<Contact> lists = new ArrayList<Contact>();
		// [1] 先查询row_contact表 的contact_id列  查询出一共有几条联系人
	    Uri uri = Uri.parse("content://com.android.contacts/raw_contacts");
	    Uri dataUri = Uri.parse("content://com.android.contacts/data");
	    Cursor cursor = context.getContentResolver().query(uri, new String[]{"contact_id"}, null, null, null);
	    while(cursor.moveToNext()){
	    	String contact_id = cursor.getString(0);
	    	Contact contact = new Contact();
    		contact.setId(contact_id);
	    	
	    	System.out.println("contact_id:"+contact_id);


			//[2]在查询data表  把data1列和mimetype_id列取出来 即可
	    	Cursor dataCursor = context.getContentResolver().query(dataUri, new String[]{"mimetype","data1"}, "raw_contact_id=?", new String[]{contact_id}, null);
	    	while(dataCursor.moveToNext()){
	    		String mimetype = dataCursor.getString(0);
	    		String data = dataCursor.getString(1);
	    		System.out.println("data:"+data+"~~"+mimetype);

				//[3]根据mimetype 进行区分数据类型
	    		if ("vnd.android.cursor.item/email_v2".equals(mimetype)) {
					System.out.println("����:"+data);
					contact.setEmail(data);
					
				}else if ("vnd.android.cursor.item/phone_v2".equals(mimetype)) {
					
					contact.setPhone(data);
					System.out.println("�绰����:"+data);
				}else if ("vnd.android.cursor.item/name".equals(mimetype)) {
					
					contact.setName(data);
					System.out.println("����:"+data);
				}
	    		
	    	}
	    	
	    	lists.add(contact);
	    }
		return lists;
		
	}
}
