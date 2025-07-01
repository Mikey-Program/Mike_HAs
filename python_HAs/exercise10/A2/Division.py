def main():
    try:
        # Eingaben vom Benutzer
        numerator_input = input("Gib den Zähler ein: ")
        denominator_input = input("Gib den Nenner ein: ")

        # In Zahlen umwandeln – kann ValueError werfen
        numerator = float(numerator_input)
        denominator = float(denominator_input)

        # Division – kann ZeroDivisionError werfen
        result = numerator / denominator

    except ValueError:
        print("Ungültige Eingabe! Bitte gib nur Zahlen ein.")
    except ZeroDivisionError:
        print("Fehler: Division durch Null ist nicht erlaubt.")
    else:
        print(f"Ergebnis: {result}")

if __name__ == "__main__":
    main()
