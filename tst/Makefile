clean:
	rm -rf *.java~ Makefile~
test: test1 test2 test3 test4
	@echo "fin du TD1 apres le TD0."
test1: TestJauge.java
	javac $< && java -ea TestJauge
test2: TestPosition.java
	javac $< && java -ea TestPosition
test3: TestJauge2.java
	javac $< && java -ea TestJauge2
test4: TestPosition2.java
	javac $< && java TestPosition2
