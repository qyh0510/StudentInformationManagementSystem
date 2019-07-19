package cn.cuc.sims.service;

import java.io.*;
import java.text.SimpleDateFormat;

import cn.cuc.sims.inter.Loggable;

public class Log implements Loggable {
	File file;
	
	public Log(String path) {
		file = new File(path);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			file = new File(path);
		}
	}
	
	@Override
	public void addLog(TYPE type, String logContent) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file, true));
			bw.write("***************************************");
			bw.newLine();
			bw.write(getCurrentTime());
			bw.newLine();
			bw.write(type.toString());
			bw.newLine();
			bw.write(logContent);
			bw.newLine();
			bw.write("***************************************");
			bw.newLine();
		} catch (IOException e) {
			addLog(Loggable.TYPE.ERROR, "日志文件写入错误");
		}
		finally {
			try {
				if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
            	addLog(Loggable.TYPE.ERROR, "日志文件关闭错误");
            }
		}
	}

	@Override
	public String readLog() {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file.getName()));
            String s;
            while((s=br.readLine()) != null) {
                sb.append(s+"\n");
            }
            return sb.toString(); 
        } catch (FileNotFoundException e) {
        	addLog(Loggable.TYPE.ERROR, "日志文件打开错误");
            System.exit(0);
        } catch (IOException e) {
        	addLog(Loggable.TYPE.ERROR, "日志文件读出错误");
        } 
        finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
            	addLog(Loggable.TYPE.ERROR, "日志文件关闭错误");
                System.exit(0);
            }
        }
		return null;
	}
	
	//获取当前时间
	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(System.currentTimeMillis());
	}
}
