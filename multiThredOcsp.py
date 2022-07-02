
import datetime
from ocspchecker import ocspchecker

url = "app.patika.dev"
print(ocspchecker.get_ocsp_status(url),"\n-------------------------------")
#!/usr/bin/python

import threading
import time

class myThread (threading.Thread):
   def __init__(self, threadID, name, counter):
      threading.Thread.__init__(self)
      self.threadID = threadID
      self.name = name
      self.counter = counter
   def run(self):
      #print("Starting " + self.name)
      # Get lock to synchronize threads
      #threadLock.acquire()
      req = ocspchecker.get_ocsp_status(url)
      f = open("ocspLogPatika.txt", "a")
      f.write(str(time.ctime(time.time()))+" "+str(req)+"\n")
      #print(req,time.ctime(time.time()))
      #print(req)
      # Free lock to release next thread
      #threadLock.release()

def print_time(threadName, delay, counter):
   while counter:
      time.sleep(delay)
      print("%s: %s" % (threadName, time.ctime(time.time())))
      print(ocspchecker.get_ocsp_status(url))
      counter -= 1

threadLock = threading.Lock()
threads = []

counter = 0
for i in range(1):
  for i in range(1):
      try:
          # Create new threads

          time_1 = time.time()
          for j in range(1000000):
            myThread(j, "newThread", j).start()
          print("BİTTİ: ")
          time_2 = time.time()
          time_interval_2 = time_2 - time_1
          print("\nZAMAN: ",time_interval_2)

          
      except:
          counter += 1
          print("HATA",counter,end="-")
input("İŞLEM TAMAMLANDI...")
  
  
