cmake_minimum_required(VERSION 3.4.1)

add_library( add
             SHARED
             src/main/cpp/util/util.cpp
             src/main/cpp/add.cpp )

find_library( log-lib
              log )

target_link_libraries( add
                       ${log-lib} )