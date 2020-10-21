rm -rf testOut/*
mkdir -p testOut
javac -d testOut -cp src $(find src "test" -name '*.java')

jar cfe test.jar  com.step.manali.TestCalculator -C testOut .
java -jar test.jar
rm -rf testOut
rm test.jar