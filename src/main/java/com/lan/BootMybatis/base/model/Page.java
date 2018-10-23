package com.lan.BootMybatis.base.model;
 
import java.util.List;
 
public class Page extends SimplePage{
	private static final long serialVersionUID = -6190845403265328029L;
	
	private boolean isFirstPage = true;//是否是第一页
	private boolean isLastPage = false;//是否是最后一页
	private int pageCount = 0;//当前页总记录数
	private int totalPage = 0;//总页数
	private int prePage = 1;//上一页页码
	private int nextPage = 1;//下一页页码
	
	public Page() {
		super();
	}
	
	public Page(int page, int rows) {
		super();
		setPage(page);
		setRows(rows);
	}
	
	@Override
	public Page setData(List data){
		super.setData(data);
		if(data!=null && data.size()>0){
			pageCount = data.size();
			if(this.page==1){
				isFirstPage=true;
			}else{
				isFirstPage=false;
			}
			//***
			totalPage = (int)Math.ceil(totalRecord/(double)rows);
			//***
			if(page==totalPage){
				isLastPage = true;
			}else{
				isLastPage = false;
			}
			//***
			if(isFirstPage){
				prePage = 1;
			}else{
				prePage = page-1;				
			}
			//***
			if(isLastPage){
				nextPage = 1;
			}else{
				nextPage = page+1;				
			}
		}else{
			isLastPage = true;
		}
		return this;
	}
	
	
	/**只要get方法**/
	public boolean isFirstPage() {
		return isFirstPage;
	}
 
	public boolean isLastPage() {
		return isLastPage;
	}
 
	public int getPageCount() {
		return pageCount;
	}
 
	public int getTotalPage() {
		return totalPage;
	}
 
	public int getPrePage() {
		return prePage;
	}
 
	public int getNextPage() {
		return nextPage;
	}
}
