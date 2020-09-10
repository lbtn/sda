package com.botton.sda.service;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import com.botton.sda.util.CustomResources;


public class NIOFileSystemWatcher {
	
	public void watcher() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(CustomResources.IN_FOLDER);
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        
        watchEvents(watchService);
        
        watchService.close();
    }
	
	private void watchEvents(WatchService watchService) throws InterruptedException, IOException {
		WatchKey key;
		Reader reader = new Reader();
		Parser parser = new Parser();
		EntityFactory ef = new EntityFactory();
		while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                	Thread.sleep(1000); //giving cpu time to the sisop get copy done
                	reader.extractLine(event, parser, ef);
            }
            key.reset();
        }
	}
	
}
