package cn.cuc.sims.inter;

public interface Loggable {
	enum TYPE {
		INFORMATION, WARNING, ERROR
	};
	
	void addLog(Loggable.TYPE type, String logContent);
	String readLog();
}
