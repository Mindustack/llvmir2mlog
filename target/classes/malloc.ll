%struct.anon = type { ptr, i32 }
%union.header = type { %struct.anon }


@freep = internal global ptr null, align 8
@base = internal global %union.header zeroinitializer, align 8
@heapcap = internal global ptr null, align 8
@llvm.global_ctors = appending global [1 x { i32, ptr, ptr }] [{ i32, ptr, ptr } { i32 65535, ptr @_GLOBAL__sub_I_test4.cpp, ptr null }]

; Function Attrs: mustprogress noinline nounwind optnone uwtable
define dso_local void @"?Mfree@@YAXPEAX@Z"(ptr noundef %0) #0 {
  %2 = alloca ptr, align 8
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  %6 = getelementptr inbounds %union.header, ptr %5, i64 -1
  store ptr %6, ptr %3, align 8
  %7 = load ptr, ptr @freep, align 8
  store ptr %7, ptr %4, align 8
  br label %8

8:                                                ; preds = %39, %1
  %9 = load ptr, ptr %3, align 8
  %10 = load ptr, ptr %4, align 8
  %11 = icmp ugt ptr %9, %10
  br i1 %11, label %12, label %18

12:                                               ; preds = %8
  %13 = load ptr, ptr %3, align 8
  %14 = load ptr, ptr %4, align 8
  %15 = getelementptr inbounds %struct.anon, ptr %14, i32 0, i32 0
  %16 = load ptr, ptr %15, align 8
  %17 = icmp ult ptr %13, %16
  br label %18

18:                                               ; preds = %12, %8
  %19 = phi i1 [ false, %8 ], [ %17, %12 ]
  %20 = xor i1 %19, true
  br i1 %20, label %21, label %43

21:                                               ; preds = %18
  %22 = load ptr, ptr %4, align 8
  %23 = load ptr, ptr %4, align 8
  %24 = getelementptr inbounds %struct.anon, ptr %23, i32 0, i32 0
  %25 = load ptr, ptr %24, align 8
  %26 = icmp uge ptr %22, %25
  br i1 %26, label %27, label %38

27:                                               ; preds = %21
  %28 = load ptr, ptr %3, align 8
  %29 = load ptr, ptr %4, align 8
  %30 = icmp ugt ptr %28, %29
  br i1 %30, label %37, label %31

31:                                               ; preds = %27
  %32 = load ptr, ptr %3, align 8
  %33 = load ptr, ptr %4, align 8
  %34 = getelementptr inbounds %struct.anon, ptr %33, i32 0, i32 0
  %35 = load ptr, ptr %34, align 8
  %36 = icmp ult ptr %32, %35
  br i1 %36, label %37, label %38

37:                                               ; preds = %31, %27
  br label %43

38:                                               ; preds = %31, %21
  br label %39

39:                                               ; preds = %38
  %40 = load ptr, ptr %4, align 8
  %41 = getelementptr inbounds %struct.anon, ptr %40, i32 0, i32 0
  %42 = load ptr, ptr %41, align 8
  store ptr %42, ptr %4, align 8
  br label %8, !llvm.loop !4

43:                                               ; preds = %37, %18
  %44 = load ptr, ptr %3, align 8
  %45 = load ptr, ptr %3, align 8
  %46 = getelementptr inbounds %struct.anon, ptr %45, i32 0, i32 1
  %47 = load i32, ptr %46, align 8
  %48 = zext i32 %47 to i64
  %49 = getelementptr inbounds %union.header, ptr %44, i64 %48
  %50 = load ptr, ptr %4, align 8
  %51 = getelementptr inbounds %struct.anon, ptr %50, i32 0, i32 0
  %52 = load ptr, ptr %51, align 8
  %53 = icmp eq ptr %49, %52
  br i1 %53, label %54, label %71

54:                                               ; preds = %43
  %55 = load ptr, ptr %4, align 8
  %56 = getelementptr inbounds %struct.anon, ptr %55, i32 0, i32 0
  %57 = load ptr, ptr %56, align 8
  %58 = getelementptr inbounds %struct.anon, ptr %57, i32 0, i32 1
  %59 = load i32, ptr %58, align 8
  %60 = load ptr, ptr %3, align 8
  %61 = getelementptr inbounds %struct.anon, ptr %60, i32 0, i32 1
  %62 = load i32, ptr %61, align 8
  %63 = add i32 %62, %59
  store i32 %63, ptr %61, align 8
  %64 = load ptr, ptr %4, align 8
  %65 = getelementptr inbounds %struct.anon, ptr %64, i32 0, i32 0
  %66 = load ptr, ptr %65, align 8
  %67 = getelementptr inbounds %struct.anon, ptr %66, i32 0, i32 0
  %68 = load ptr, ptr %67, align 8
  %69 = load ptr, ptr %3, align 8
  %70 = getelementptr inbounds %struct.anon, ptr %69, i32 0, i32 0
  store ptr %68, ptr %70, align 8
  br label %77

71:                                               ; preds = %43
  %72 = load ptr, ptr %4, align 8
  %73 = getelementptr inbounds %struct.anon, ptr %72, i32 0, i32 0
  %74 = load ptr, ptr %73, align 8
  %75 = load ptr, ptr %3, align 8
  %76 = getelementptr inbounds %struct.anon, ptr %75, i32 0, i32 0
  store ptr %74, ptr %76, align 8
  br label %77

77:                                               ; preds = %71, %54
  %78 = load ptr, ptr %4, align 8
  %79 = load ptr, ptr %4, align 8
  %80 = getelementptr inbounds %struct.anon, ptr %79, i32 0, i32 1
  %81 = load i32, ptr %80, align 8
  %82 = zext i32 %81 to i64
  %83 = getelementptr inbounds %union.header, ptr %78, i64 %82
  %84 = load ptr, ptr %3, align 8
  %85 = icmp eq ptr %83, %84
  br i1 %85, label %86, label %99

86:                                               ; preds = %77
  %87 = load ptr, ptr %3, align 8
  %88 = getelementptr inbounds %struct.anon, ptr %87, i32 0, i32 1
  %89 = load i32, ptr %88, align 8
  %90 = load ptr, ptr %4, align 8
  %91 = getelementptr inbounds %struct.anon, ptr %90, i32 0, i32 1
  %92 = load i32, ptr %91, align 8
  %93 = add i32 %92, %89
  store i32 %93, ptr %91, align 8
  %94 = load ptr, ptr %3, align 8
  %95 = getelementptr inbounds %struct.anon, ptr %94, i32 0, i32 0
  %96 = load ptr, ptr %95, align 8
  %97 = load ptr, ptr %4, align 8
  %98 = getelementptr inbounds %struct.anon, ptr %97, i32 0, i32 0
  store ptr %96, ptr %98, align 8
  br label %103

99:                                               ; preds = %77
  %100 = load ptr, ptr %3, align 8
  %101 = load ptr, ptr %4, align 8
  %102 = getelementptr inbounds %struct.anon, ptr %101, i32 0, i32 0
  store ptr %100, ptr %102, align 8
  br label %103

103:                                              ; preds = %99, %86
  %104 = load ptr, ptr %4, align 8
  store ptr %104, ptr @freep, align 8
  ret void
}

; Function Attrs: mustprogress noinline optnone uwtable
define dso_local noundef ptr @"?Mmalloc@@YAPEAXI@Z"(i32 noundef %0) #1 {
  %2 = alloca ptr, align 8
  %3 = alloca i32, align 4
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i32, align 4
  store i32 %0, ptr %3, align 4
  %7 = load i32, ptr %3, align 4
  %8 = zext i32 %7 to i64
  %9 = add i64 %8, 16
  %10 = sub i64 %9, 1
  %11 = udiv i64 %10, 16
  %12 = add i64 %11, 1
  %13 = trunc i64 %12 to i32
  store i32 %13, ptr %6, align 4
  %14 = load ptr, ptr @freep, align 8
  store ptr %14, ptr %5, align 8
  %15 = icmp eq ptr %14, null
  br i1 %15, label %16, label %17

16:                                               ; preds = %1
  store ptr @base, ptr %5, align 8
  store ptr @base, ptr @freep, align 8
  store ptr @base, ptr @base, align 8
  store i32 0, ptr getelementptr inbounds (%struct.anon, ptr @base, i32 0, i32 1), align 8
  br label %17

17:                                               ; preds = %16, %1
  %18 = load ptr, ptr %5, align 8
  %19 = getelementptr inbounds %struct.anon, ptr %18, i32 0, i32 0
  %20 = load ptr, ptr %19, align 8
  store ptr %20, ptr %4, align 8
  br label %21

21:                                               ; preds = %69, %17
  %22 = load ptr, ptr %4, align 8
  %23 = getelementptr inbounds %struct.anon, ptr %22, i32 0, i32 1
  %24 = load i32, ptr %23, align 8
  %25 = load i32, ptr %6, align 4
  %26 = icmp uge i32 %24, %25
  br i1 %26, label %27, label %58

27:                                               ; preds = %21
  %28 = load ptr, ptr %4, align 8
  %29 = getelementptr inbounds %struct.anon, ptr %28, i32 0, i32 1
  %30 = load i32, ptr %29, align 8
  %31 = load i32, ptr %6, align 4
  %32 = icmp eq i32 %30, %31
  br i1 %32, label %33, label %39

33:                                               ; preds = %27
  %34 = load ptr, ptr %4, align 8
  %35 = getelementptr inbounds %struct.anon, ptr %34, i32 0, i32 0
  %36 = load ptr, ptr %35, align 8
  %37 = load ptr, ptr %5, align 8
  %38 = getelementptr inbounds %struct.anon, ptr %37, i32 0, i32 0
  store ptr %36, ptr %38, align 8
  br label %54

39:                                               ; preds = %27
  %40 = load i32, ptr %6, align 4
  %41 = load ptr, ptr %4, align 8
  %42 = getelementptr inbounds %struct.anon, ptr %41, i32 0, i32 1
  %43 = load i32, ptr %42, align 8
  %44 = sub i32 %43, %40
  store i32 %44, ptr %42, align 8
  %45 = load ptr, ptr %4, align 8
  %46 = getelementptr inbounds %struct.anon, ptr %45, i32 0, i32 1
  %47 = load i32, ptr %46, align 8
  %48 = load ptr, ptr %4, align 8
  %49 = zext i32 %47 to i64
  %50 = getelementptr inbounds %union.header, ptr %48, i64 %49
  store ptr %50, ptr %4, align 8
  %51 = load i32, ptr %6, align 4
  %52 = load ptr, ptr %4, align 8
  %53 = getelementptr inbounds %struct.anon, ptr %52, i32 0, i32 1
  store i32 %51, ptr %53, align 8
  br label %54

54:                                               ; preds = %39, %33
  %55 = load ptr, ptr %5, align 8
  store ptr %55, ptr @freep, align 8
  %56 = load ptr, ptr %4, align 8
  %57 = getelementptr inbounds %union.header, ptr %56, i64 1
  store ptr %57, ptr %2, align 8
  br label %74

58:                                               ; preds = %21
  %59 = load ptr, ptr %4, align 8
  %60 = load ptr, ptr @freep, align 8
  %61 = icmp eq ptr %59, %60
  br i1 %61, label %62, label %68

62:                                               ; preds = %58
  %63 = load i32, ptr %6, align 4
  %64 = call noundef ptr @"?Mmorecore@@YAPEATheader@@I@Z"(i32 noundef %63)
  store ptr %64, ptr %4, align 8
  %65 = icmp eq ptr %64, null
  br i1 %65, label %66, label %67

66:                                               ; preds = %62
  store ptr null, ptr %2, align 8
  br label %74

67:                                               ; preds = %62
  br label %68

68:                                               ; preds = %67, %58
  br label %69

69:                                               ; preds = %68
  %70 = load ptr, ptr %4, align 8
  store ptr %70, ptr %5, align 8
  %71 = load ptr, ptr %4, align 8
  %72 = getelementptr inbounds %struct.anon, ptr %71, i32 0, i32 0
  %73 = load ptr, ptr %72, align 8
  store ptr %73, ptr %4, align 8
  br label %21, !llvm.loop !6

74:                                               ; preds = %66, %54
  %75 = load ptr, ptr %2, align 8
  ret ptr %75
}

; Function Attrs: mustprogress noinline nounwind optnone uwtable
define internal noundef ptr @"?Mmorecore@@YAPEATheader@@I@Z"(i32 noundef %0) #0 {
  %2 = alloca i32, align 4
  %3 = alloca ptr, align 8
  store i32 %0, ptr %2, align 4
  %4 = load i32, ptr %2, align 4
  %5 = zext i32 %4 to i64
  %6 = mul i64 %5, 16
  %7 = load ptr, ptr @heapcap, align 8
  %8 = getelementptr inbounds %union.header, ptr %7, i64 %6
  store ptr %8, ptr @heapcap, align 8
  %9 = load ptr, ptr @heapcap, align 8
  store ptr %9, ptr %3, align 8
  %10 = load i32, ptr %2, align 4
  %11 = load ptr, ptr %3, align 8
  %12 = getelementptr inbounds %struct.anon, ptr %11, i32 0, i32 1
  store i32 %10, ptr %12, align 8
  %13 = load ptr, ptr %3, align 8
  %14 = getelementptr inbounds %union.header, ptr %13, i64 1
  call void @"?Mfree@@YAXPEAX@Z"(ptr noundef %14)
  %15 = load ptr, ptr @freep, align 8
  ret ptr %15
}

; Function Attrs: mustprogress noinline norecurse optnone uwtable
define dso_local noundef i32 @main(i32 noundef %0) #2 {
  %2 = alloca i32, align 4
  %3 = alloca i32, align 4
  %4 = alloca ptr, align 8
  store i32 0, ptr %2, align 4
  store i32 %0, ptr %3, align 4
  %5 = load i32, ptr %3, align 4
  %6 = call noundef ptr @"?Mmalloc@@YAPEAXI@Z"(i32 noundef %5)
  store ptr %6, ptr %4, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = ptrtoint ptr %7 to i32
  ret i32 %8
}

; Function Attrs: noinline uwtable
define internal void @"??__Eheapcap@@YAXXZ"() #3 {
  %1 = load ptr, ptr @freep, align 8
  store ptr %1, ptr @heapcap, align 8
  ret void
}

; Function Attrs: noinline uwtable
define internal void @_GLOBAL__sub_I_test4.cpp() #3 {
  call void @"??__Eheapcap@@YAXXZ"()
  ret void
}

