package com.mzywx.test;

import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_imgcodecs;

import com.mzywx.charsocr.PlateRecognition;

public class EasyPRTest {

	public static void main(String[] args) {
		String imgPath = "res/image/test_image/plate_detect.jpg";
		Mat src = opencv_imgcodecs.imread(imgPath);
		String ret = PlateRecognition.plateRecognise(src); // 得到结果 
		System.err.println(ret);
	}
}
