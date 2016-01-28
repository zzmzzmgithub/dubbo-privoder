package com.zzm.Impl;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.zzm.inface.GetSystemIP;

public class GetSystemIPImpl implements GetSystemIP {

	public String ipStr = "";

	@Override
	public String getIP() {

		try {
			ipStr = InetAddress.getLocalHost().toString();
			System.out.println("服务IP = " + ipStr);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return ipStr;
	}

}
