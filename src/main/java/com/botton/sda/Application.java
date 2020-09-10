package com.botton.sda;

import java.io.IOException;

import com.botton.sda.service.NIOFileSystemService;

public class Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Application Started");
		NIOFileSystemService dw = new NIOFileSystemService();
		dw.watcher();
	}
	
}
