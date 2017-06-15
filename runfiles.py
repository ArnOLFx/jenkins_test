from os import listdir
from os.path import isfile, join
import os

path = "/var/lib/jenkins/workspace/testagain"

#Get a list of items, items are files in this case
onlyfiles = [f for f in listdir(path) if isfile(join(path, f))]

print onlyfiles

for (i, file) in enumerate(onlyfiles):
	#Look for all files ending with ".java"
	if (file.split(".", 1)[1] == "java"):
		#Then javac and java the files for build
		os.system("cd " + path)
		os.system("javac " + onlyfiles[i])
		os.system("java " + onlyfiles[i].split(".", 1)[0])
