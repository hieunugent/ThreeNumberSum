JC=javac
JA=java


default: clean complie run

clean:
	source ~/.bash_profile
	rm -f *.class
complie:
	$(JC) *.java
run:
	$(JA) TestRunner 
