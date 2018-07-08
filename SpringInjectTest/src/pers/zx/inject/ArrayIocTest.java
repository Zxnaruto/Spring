package pers.zx.inject;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * 
 * Spring DI(依赖注入)测试
 *
 */
public class ArrayIocTest {

	private List<String>list;
	private Map<String,String>map;
	private Set<String>set;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	//操作
	public void testData(){
		//集合遍历
		for(String str:list){
			System.out.println("list====="+str);
		}
		for(String str:set){
			System.out.println("set====="+str);
		}
		Set<String>keys=map.keySet();
		for(String k:keys){
			System.out.println(k+":"+map.get(k));
		}
	}
}
