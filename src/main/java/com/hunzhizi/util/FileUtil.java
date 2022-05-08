package com.hunzhizi.util;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FileUtil {
	private static String seperator = System.getProperty("file.separator");
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat(
			"yyyyMMddHHmmss"); // 时间格式化的格式
	private static final Random r = new Random();

	public static final String shopImgPath;
	 static {
		String os = System.getProperty("os.name");
		 String basePath;
		 if (os.toLowerCase().startsWith("win")) {
			basePath = "E:/img/yanChao/";
		} else {
			basePath = "/home/hunzhizi/";
		}
		basePath = basePath.replace("/", seperator);
		shopImgPath = (basePath +"upload/images/item/profile/").replace("/", seperator);
		new File(shopImgPath).mkdirs();
	 }

	/**
	 * 获取传入的img的存放地址
	 * @param userId
	 * @param img
	 * @return
	 */
	 public static String setFileAddr(Integer userId, MultipartFile img){
		 String dir = shopImgPath + userId + seperator ;
		 new File(dir).mkdir();
	 	return dir + userId + getFileExtension(img);
	 }

	 public static String getFileAddr(Integer userId){
	 	return shopImgPath+userId+ seperator;
	 }

	public static String getHeadLineImagePath() {
		String headLineImagePath = "/upload/images/item/headtitle/";
		headLineImagePath = headLineImagePath.replace("/", seperator);
		return headLineImagePath;
	}

	public static String getShopCategoryImagePath() {
		String shopCategoryImagePath = "/upload/images/item/shopcategory/";
		shopCategoryImagePath = shopCategoryImagePath.replace("/", seperator);
		return shopCategoryImagePath;
	}
	
	public static String getPersonInfoImagePath() {
		String personInfoImagePath = "/upload/images/item/personinfo/";
		personInfoImagePath = personInfoImagePath.replace("/", seperator);
		return personInfoImagePath;
	}



	private static String getFileExtension(MultipartFile cFile) {
		String originalFileName = cFile.getOriginalFilename();
		return originalFileName.substring(originalFileName.lastIndexOf("."));
	}


	public static String getRandomFileName() {
		// 生成随机文件名：当前年月日时分秒+五位随机数（为了在实际项目中防止文件同名而进行的处理）
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; // 获取随机数
		String nowTimeStr = sDateFormat.format(new Date()); // 当前时间
		return nowTimeStr + rannum;
	}


}
