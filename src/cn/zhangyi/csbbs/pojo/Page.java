package cn.zhangyi.csbbs.pojo;

public class Page {
	private long pc;//当前页码
	private long tr;//总记录数
	private long ps;//每页记录数
	private long tp;//总页数
	private String url;//请求路径和参数，

	public Page(){
		setPs(5);
	}
	public void setPc(long pc) {
		this.pc = pc;
	}
	public void setTr(long tr) {
		this.tr = tr;
	}
	public void setTp(long tp) {
		this.tp = tp;
	}
	// 计算总页数
	public long getTp() {
		long tp = tr / ps;
		return tr % ps == 0 ? tp : tp + 1;
	}
	
	public long getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public long getTr() {
		return tr;
	}
	public void setTr(Long tr) {
		this.tr = tr;
	}
	public long getPs() {
		return ps;
	}
	public void setPs(long ps) {
		this.ps = ps;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
