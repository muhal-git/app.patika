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

import datetime
from ocspchecker import ocspchecker

url = "kamusm.bilgem.tubitak.gov.tr"
print(ocspchecker.get_ocsp_status(url))
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

sorgu = 48000
for i in range(15):
  time_1 = time.time()
  """
  for i in range(sorgu):
      req = ocspchecker.get_ocsp_status(url)
  """
  time_2 = time.time()
  time_interval_1 = time_2 - time_1


  time_1 = time.time()
  counter = 0
  for i in range(int(sorgu/48)):
      try:
          # Create new threads
          thread1 = myThread(1, "Thread-1", 1)
          thread2 = myThread(2, "Thread-2", 2)
          thread3 = myThread(3, "Thread-3", 3)
          thread4 = myThread(4, "Thread-4", 4)
          thread5 = myThread(5, "Thread-5", 5)
          thread6 = myThread(6, "Thread-6", 6)
          thread7 = myThread(7, "Thread-1", 7)
          thread8 = myThread(8, "Thread-2", 8)
          thread9 = myThread(9, "Thread-3", 9)
          thread10 = myThread(10, "Thread-4", 10)
          thread11 = myThread(11, "Thread-5", 11)
          thread12 = myThread(12, "Thread-6", 12)
          thread13 = myThread(13, "Thread-1", 13)
          thread14 = myThread(14, "Thread-2", 14)
          thread15 = myThread(15, "Thread-3", 15)
          thread16 = myThread(16, "Thread-4", 16)
          thread17 = myThread(17, "Thread-5", 17)
          thread18 = myThread(18, "Thread-6", 18)
          thread19 = myThread(19, "Thread-1", 19)
          thread20 = myThread(20, "Thread-2", 20)
          thread21 = myThread(21, "Thread-3", 21)
          thread22 = myThread(22, "Thread-4", 22)
          thread23 = myThread(23, "Thread-5", 23)
          thread24 = myThread(24, "Thread-6", 24)
          thread25 = myThread(25, "Thread-1", 25)
          thread26 = myThread(26, "Thread-2", 26)
          thread27 = myThread(27, "Thread-3", 27)
          thread28 = myThread(28, "Thread-4", 28)
          thread29 = myThread(29, "Thread-5", 29)
          thread30 = myThread(30, "Thread-6", 30)
          thread31 = myThread(31, "Thread-1", 31)
          thread32 = myThread(32, "Thread-2", 32)
          thread33 = myThread(33, "Thread-3", 33)
          thread34 = myThread(34, "Thread-4", 34)
          thread35 = myThread(35, "Thread-5", 35)
          thread36 = myThread(36, "Thread-6", 36)
          thread37 = myThread(37, "Thread-1", 37)
          thread38 = myThread(38, "Thread-2", 38)
          thread39 = myThread(39, "Thread-3", 39)
          thread40 = myThread(40, "Thread-4", 40)
          thread41 = myThread(41, "Thread-5", 41)
          thread42 = myThread(42, "Thread-6", 42)
          thread43 = myThread(43, "Thread-1", 43)
          thread44 = myThread(44, "Thread-2", 44)
          thread45 = myThread(45, "Thread-3", 45)
          thread46 = myThread(46, "Thread-4", 46)
          thread47 = myThread(47, "Thread-5", 47)
          thread48 = myThread(48, "Thread-6", 48)

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
          thread13.start()
          thread14.start()
          thread15.start()
          thread16.start()
          thread17.start()
          thread18.start()
          thread19.start()
          thread20.start()
          thread21.start()
          thread22.start()
          thread23.start()
          thread24.start()
          thread25.start()
          thread26.start()
          thread27.start()
          thread28.start()
          thread29.start()
          thread30.start()
          thread31.start()
          thread32.start()
          thread33.start()
          thread34.start()
          thread35.start()
          thread36.start()
          thread37.start()
          thread38.start()
          thread39.start()
          thread40.start()
          thread41.start()
          thread42.start()
          thread43.start()
          thread44.start()
          thread45.start()
          thread46.start()
          thread47.start()
          thread48.start()

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
          threads.append(thread13)
          threads.append(thread14)
          threads.append(thread15)
          threads.append(thread16)
          threads.append(thread17)
          threads.append(thread18)
          threads.append(thread19)
          threads.append(thread20)
          threads.append(thread21)
          threads.append(thread22)
          threads.append(thread23)
          threads.append(thread24)
          threads.append(thread25)
          threads.append(thread26)
          threads.append(thread27)
          threads.append(thread28)
          threads.append(thread29)
          threads.append(thread30)
          threads.append(thread31)
          threads.append(thread32)
          threads.append(thread33)
          threads.append(thread34)
          threads.append(thread35)
          threads.append(thread36)
          threads.append(thread37)
          threads.append(thread38)
          threads.append(thread39)
          threads.append(thread40)
          threads.append(thread41)
          threads.append(thread42)
          threads.append(thread43)
          threads.append(thread44)
          threads.append(thread45)
          threads.append(thread46)
          threads.append(thread47)
          threads.append(thread48)

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
