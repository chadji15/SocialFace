import csv
import random

header = "event_id\tprofile_id"

responses = []
for user in range(1,100):
    for event in range(1,10):
        if random.random() < 0.2:
            responses.append([event, user])

fp = open("responses.txt", 'w')
fp.write(f"{header}\n")
for response in responses:
    fp.write(f"{response[0]}\t{response[1]}\n")
fp.close()
