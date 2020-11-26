import string
import random

for _ in range(100):
    print(''.join(random.choice(string.ascii_uppercase + string.digits) for _ in range(6)))