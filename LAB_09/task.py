class A:
    def __init__(self) -> None:
        pass


class B(A):
    def __init__(self) -> None:
        super().__init__()


class C:
    def __init__(self) -> None:
        pass


class D(B, C):
    def __init__(self) -> None:
        super().__init__()

    def m1():
        print("D")
