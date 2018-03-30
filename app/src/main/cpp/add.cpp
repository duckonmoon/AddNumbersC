#include <jni.h>
#include "util/util.h"


extern "C"
JNIEXPORT jint JNICALL
Java_ua_com_test_softserve_addnumbers_AddActivity_addNumbers(JNIEnv *env, jobject instance, jint i,
                                                             jint m) {
    return (jint) addNumbers(i,m);
}


