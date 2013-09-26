all: package

.PHONY: package
package:
	@mvn package

.PHONY: deploy
deploy:
	@mvn jboss-as:deploy

.PHONY: compile
compile:
	@mvn compile

.PHONY: javadoc
javadoc:
	@mvn javadoc:javadoc

.PHONY: checkstyle
checkstyle:
	@mvn checkstyle:checkstyle

.PHONY: clean
clean:
	@mvn clean
