from datetime import datetime

class Mail:
    def __init__(self, subject, sender, message, read):
        self.subject = subject
        self.sender = sender
        self.datetime = datetime.now()
        self.message = message
        self.read =  False

    def mark_as_read(self):
        self.read = True

    def print_full(self):
        formatted_time = self.datetime.strftime("%d.%m.%Y, %H:%M")
        print(f"{self.subject} from {self.sender} on {formatted_time}: {self.message}")
