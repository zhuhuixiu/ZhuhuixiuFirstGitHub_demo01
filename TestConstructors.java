package constructors;

public class TestConstructors {

	public static void main(String[] args) {
		
		//Dog qiangni  = new Dog();  //做对象的初始化操作
		//Dog qiangxiao = new Dog();
		//qiangni.print();
		//qiangxiao.print();
		
		
		//使用有参数的构造方法进行对象的创建
//		String name = "小白";
//		int health = 78;
//		int love = 23;
		int num = 0;
//		String strain = "田园犬";
		Dog xiaobai = new Dog("小白",78,23,"田园犬");
		xiaobai.print();
//		Dog xiaohuang = new Dog("小黄",88,23,"泰迪");
//		xiaohuang.print();
		
		
		

	}

}
