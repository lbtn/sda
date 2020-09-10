package com.botton.sda;

import java.io.IOException;
import java.net.URISyntaxException;

import com.botton.sda.service.NIOFileSystemWatcher;

public class Application {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		System.out.println("Application Started");
		NIOFileSystemWatcher dw = new NIOFileSystemWatcher();
		dw.watcher();
	}
	
}
