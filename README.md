Xcore Maven Example
---

[![Build Status](https://travis-ci.org/ghillairet/xcore-maven-example.svg?branch=master)](https://travis-ci.org/ghillairet/xcore-maven-example)

This project shows how to use Maven (without Tycho) with the xtext-maven-plugin to generate Java code from an Xcore model.

To run it, you need Maven and use the command:

```
maven clean compile
```

The generated Java code will be put in the src/main/java-gen folder.
The clean command deletes the src/main/java-gen folder, so it should be used before re-generating code.
