import datetime
from ocspchecker import ocspchecker
print(ocspchecker.get_ocsp_status("youtube.com"))
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
      req = ocspchecker.get_ocsp_status("youtube.com")
      #print(req)
      # Free lock to release next thread
      #threadLock.release()

def print_time(threadName, delay, counter):
   while counter:
      time.sleep(delay)
      print("%s: %s" % (threadName, time.ctime(time.time())))
      print(ocspchecker.get_ocsp_status("youtube.com"))
      counter -= 1

threadLock = threading.Lock()
threads = []

sorgu = 720
for i in range(15):
  time_1 = time.time()

  for i in range(sorgu):
      req = ocspchecker.get_ocsp_status("youtube.com")

  time_2 = time.time()
  time_interval_1 = time_2 - time_1


  time_1 = time.time()
  counter = 0
  for i in range(int(sorgu/12)):
      try:
          # Create new threads
          thread1 = myThread(1, "Thread-1", 1)
          thread2 = myThread(2, "Thread-2", 2)
          thread3 = myThread(3, "Thread-3", 3)
          thread4 = myThread(1, "Thread-4", 4)
          thread5 = myThread(2, "Thread-5", 5)
          thread6 = myThread(3, "Thread-6", 6)
          thread7 = myThread(1, "Thread-1", 7)
          thread8 = myThread(2, "Thread-2", 8)
          thread9 = myThread(3, "Thread-3", 9)
          thread10 = myThread(1, "Thread-4", 10)
          thread11 = myThread(2, "Thread-5", 11)
          thread12 = myThread(3, "Thread-6", 12)

          # Start new Threads
          thread1.start()
          thread2.start()
          thread3.start()
          thread4.start()
          thread5.start()
          thread6.start()
          thread7.start()
          thread8.start()
          thread9.start()
          thread10.start()
          thread11.start()
          thread12.start()

          # Add threads to thread list
          threads.append(thread1)
          threads.append(thread2)
          threads.append(thread3)
          threads.append(thread4)
          threads.append(thread5)
          threads.append(thread6)
          threads.append(thread7)
          threads.append(thread8)
          threads.append(thread9)
          threads.append(thread10)
          threads.append(thread11)
          threads.append(thread12)

          # Wait for all threads to complete
          for t in threads:
              t.join()
      except:
          counter += 1
          print("HATA",counter,end="-")
  time_2 = time.time()
  time_interval_2 = time_2 - time_1
  FARK = time_interval_2 - time_interval_1
  print("\nZAMAN FARKI: ",FARK,"    --    ",time_interval_2)

  ### final
