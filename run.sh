rm -rf out/*
mkdir -p out
javac -d out -cp src $(find src -name '*.java')
jar cfe run.jar com.step.manali.Main -C out .
java -jar run.jar
rm -rf run.jar out