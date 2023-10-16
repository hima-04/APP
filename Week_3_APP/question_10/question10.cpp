#include <iostream>
#include <opencv2/opencv.hpp>
using namespace std;
using namespace cv;
int main() {
    Mat RA2211003010002_originalImage = imread("C:/Users/vivek/OneDrive/Pictures/Saved Pictures/funny_doggo.jpg");
    imshow("Original Image", RA2211003010002_originalImage);
    waitKey(0);
    
    int RA2211003010002_newWidth,RA2211003010002_newHeight;
    cout << "Enter the height you want the image to be resized to in px: ";
    cin >> RA2211003010002_newHeight,cin.ignore();
    cout << "Enter the width you want the image to be resized to in px: ";
    cin >> RA2211003010002_newWidth,cin.ignore();
    
    Mat RA2211003010002_resizedImage;
    resize(RA2211003010002_originalImage, RA2211003010002_resizedImage,Size(RA2211003010002_newWidth, RA2211003010002_newHeight));

    imshow("Resized Image", RA2211003010002_resizedImage);
    waitKey(0);

    return 0;
}