#!/bin/sh

rm -f sources.list
find . -name \*.java -print >> sources.list
j2objc -sourcepath src/main/java/ -classpath target/classes/ -d src/main/objc/ `cat sources.list`
