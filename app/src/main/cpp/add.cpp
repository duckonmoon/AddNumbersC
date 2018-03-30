#include <jni.h>
#include "util/util.h"


extern "C"
JNIEXPORT jint JNICALL
Java_ua_com_test_softserve_addnumbers_AddActivity_addNumbers(JNIEnv *env, jobject instance, jint jint1, jint jint2) {
    int int1 = (int) jint1;
    int int2 = (int) jint2;
    return (jint) addNumbers(int1,int2);
}


