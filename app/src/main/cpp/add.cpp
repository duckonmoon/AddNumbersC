#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_ua_com_test_softserve_addnumbers_AddActivity_addNumbers(JNIEnv *env, jobject instance, jint i,
                                                             jint m) {
    jint result = i + m;
    return result;
}