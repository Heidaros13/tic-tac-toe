#!/bin/bash

OUTPUT="classes"

MAIN="src/is/ru/bazinga/"
SPEC="test/is/ru/bazinga/"

mkdir -p classes

javac $MAIN/*.java -d $OUTPUT
javac -cp classes:lib/junit.jar:lib/hamcrest-core.jar $SPEC/*.java -d $OUTPUT
