class Inbox:
    def __init__(self):
        self.mails = []

    def add_mail(self, mail):
        self.mails.append(mail)

    def print_headers(self):
        for mail in self.mails:
            formatted_time = mail.datetime.strftime("%d.%m.%Y, %H:%M")
            print(f"Subject: {mail.subject}, Sender: {mail.sender}, Datetime: {formatted_time}, Read: {mail.read}")

    def open(self, index):
        if index < 0 or index >= len(self.mails):
            print("falscher Index")
            return

        mail = self.mails[index]
        mail.print_full()
        mail.mark_as_read()

    def count_unread(self):
        count = 0
        for mail in self.mails:
            if not mail.read:
                count += 1

        return count


