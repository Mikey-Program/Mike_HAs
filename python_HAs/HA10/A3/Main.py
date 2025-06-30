from HA10.A3.Inbox import Inbox
from HA10.A3.Mail import Mail


def main():
    # Inbox erstellen
    inbox = Inbox()

    # Mails erstellen
    mail1 = Mail("Meeting", "peter@example.com", "Besprechung um 10 Uhr", False)
    mail2 = Mail("Urlaub", "anna@example.com", "Kann ich 2 Wochen nehmen?", False)
    mail3 = Mail("Angebot", "firma@example.com", "10% Rabatt für dich!", False)

    # Mails zur Inbox hinzufügen
    inbox.add_mail(mail1)
    inbox.add_mail(mail2)
    inbox.add_mail(mail3)

    # Header anzeigen
    print("Alle Mail-Header:")
    inbox.print_headers()

    # Anzahl ungelesener Mails anzeigen
    print(f"\nUngelesene Mails: {inbox.count_unread()}")

    # Mails öffnen (z. B. die erste und dritte)
    print("\nÖffne Mail 0:")
    inbox.open(0)

    print("\nÖffne Mail 2:")
    inbox.open(2)

    # Nochmals ungelesene zählen
    print(f"\nUngelesene Mails nach dem Öffnen: {inbox.count_unread()}")

if __name__ == "__main__":
    main()