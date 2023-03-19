; ModuleID = 'test4.cpp'
source_filename = "test4.cpp"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct.block = type { %struct.block*, i32 }

@_ZL5freep = internal global %struct.block* null, align 8
@_ZL4base = internal global %struct.block zeroinitializer, align 8

; Function Attrs: noinline optnone uwtable
define dso_local i8* @_Z6malloci(i32 %0) #0 {
  %2 = alloca i8*, align 8
  %3 = alloca i32, align 4
  %4 = alloca %struct.block*, align 8
  %5 = alloca %struct.block*, align 8
  %6 = alloca i32, align 4
  store i32 %0, i32* %3, align 4
  %7 = load i32, i32* %3, align 4
  %8 = add nsw i32 %7, 8
  %9 = sub nsw i32 %8, 1
  %10 = sdiv i32 %9, 8
  %11 = add nsw i32 %10, 1
  store i32 %11, i32* %6, align 4
  %12 = load %struct.block*, %struct.block** @_ZL5freep, align 8
  store %struct.block* %12, %struct.block** %5, align 8
  %13 = icmp eq %struct.block* %12, null
  br i1 %13, label %14, label %15

14:                                               ; preds = %1
  store %struct.block* @_ZL4base, %struct.block** %5, align 8
  store %struct.block* @_ZL4base, %struct.block** @_ZL5freep, align 8
  store %struct.block* @_ZL4base, %struct.block** getelementptr inbounds (%struct.block, %struct.block* @_ZL4base, i32 0, i32 0), align 8
  store i32 0, i32* getelementptr inbounds (%struct.block, %struct.block* @_ZL4base, i32 0, i32 1), align 8
  br label %15

15:                                               ; preds = %14, %1
  %16 = load %struct.block*, %struct.block** %5, align 8
  %17 = getelementptr inbounds %struct.block, %struct.block* %16, i32 0, i32 0
  %18 = load %struct.block*, %struct.block** %17, align 8
  store %struct.block* %18, %struct.block** %4, align 8
  br label %19

19:                                               ; preds = %68, %15
  %20 = load %struct.block*, %struct.block** %4, align 8
  %21 = getelementptr inbounds %struct.block, %struct.block* %20, i32 0, i32 1
  %22 = load i32, i32* %21, align 8
  %23 = load i32, i32* %6, align 4
  %24 = icmp sge i32 %22, %23
  br i1 %24, label %25, label %57

25:                                               ; preds = %19
  %26 = load %struct.block*, %struct.block** %4, align 8
  %27 = getelementptr inbounds %struct.block, %struct.block* %26, i32 0, i32 1
  %28 = load i32, i32* %27, align 8
  %29 = load i32, i32* %6, align 4
  %30 = icmp eq i32 %28, %29
  br i1 %30, label %31, label %37

31:                                               ; preds = %25
  %32 = load %struct.block*, %struct.block** %4, align 8
  %33 = getelementptr inbounds %struct.block, %struct.block* %32, i32 0, i32 0
  %34 = load %struct.block*, %struct.block** %33, align 8
  %35 = load %struct.block*, %struct.block** %5, align 8
  %36 = getelementptr inbounds %struct.block, %struct.block* %35, i32 0, i32 0
  store %struct.block* %34, %struct.block** %36, align 8
  br label %52

37:                                               ; preds = %25
  %38 = load i32, i32* %6, align 4
  %39 = load %struct.block*, %struct.block** %4, align 8
  %40 = getelementptr inbounds %struct.block, %struct.block* %39, i32 0, i32 1
  %41 = load i32, i32* %40, align 8
  %42 = sub nsw i32 %41, %38
  store i32 %42, i32* %40, align 8
  %43 = load %struct.block*, %struct.block** %4, align 8
  %44 = getelementptr inbounds %struct.block, %struct.block* %43, i32 0, i32 1
  %45 = load i32, i32* %44, align 8
  %46 = load %struct.block*, %struct.block** %4, align 8
  %47 = sext i32 %45 to i64
  %48 = getelementptr inbounds %struct.block, %struct.block* %46, i64 %47
  store %struct.block* %48, %struct.block** %4, align 8
  %49 = load i32, i32* %6, align 4
  %50 = load %struct.block*, %struct.block** %4, align 8
  %51 = getelementptr inbounds %struct.block, %struct.block* %50, i32 0, i32 1
  store i32 %49, i32* %51, align 8
  br label %52

52:                                               ; preds = %37, %31
  %53 = load %struct.block*, %struct.block** %5, align 8
  store %struct.block* %53, %struct.block** @_ZL5freep, align 8
  %54 = load %struct.block*, %struct.block** %4, align 8
  %55 = getelementptr inbounds %struct.block, %struct.block* %54, i64 1
  %56 = bitcast %struct.block* %55 to i8*
  store i8* %56, i8** %2, align 8
  br label %73

57:                                               ; preds = %19
  %58 = load %struct.block*, %struct.block** %4, align 8
  %59 = load %struct.block*, %struct.block** @_ZL5freep, align 8
  %60 = icmp eq %struct.block* %58, %59
  br i1 %60, label %61, label %67

61:                                               ; preds = %57
  %62 = load i32, i32* %6, align 4
  %63 = call %struct.block* @_Z8morecorei(i32 %62)
  store %struct.block* %63, %struct.block** %4, align 8
  %64 = icmp eq %struct.block* %63, null
  br i1 %64, label %65, label %66

65:                                               ; preds = %61
  store i8* null, i8** %2, align 8
  br label %73

66:                                               ; preds = %61
  br label %67

67:                                               ; preds = %66, %57
  br label %68

68:                                               ; preds = %67
  %69 = load %struct.block*, %struct.block** %4, align 8
  store %struct.block* %69, %struct.block** %5, align 8
  %70 = load %struct.block*, %struct.block** %4, align 8
  %71 = getelementptr inbounds %struct.block, %struct.block* %70, i32 0, i32 0
  %72 = load %struct.block*, %struct.block** %71, align 8
  store %struct.block* %72, %struct.block** %4, align 8
  br label %19

73:                                               ; preds = %65, %52
  %74 = load i8*, i8** %2, align 8
  ret i8* %74
}

declare dso_local %struct.block* @_Z8morecorei(i32) #1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @_Z4freePv(i8* %0) #2 {
  %2 = alloca i8*, align 8
  %3 = alloca %struct.block*, align 8
  %4 = alloca %struct.block*, align 8
  store i8* %0, i8** %2, align 8
  %5 = load i8*, i8** %2, align 8
  %6 = bitcast i8* %5 to %struct.block*
  %7 = getelementptr inbounds %struct.block, %struct.block* %6, i64 -1
  store %struct.block* %7, %struct.block** %3, align 8
  %8 = load %struct.block*, %struct.block** @_ZL5freep, align 8
  store %struct.block* %8, %struct.block** %4, align 8
  br label %9

9:                                                ; preds = %40, %1
  %10 = load %struct.block*, %struct.block** %3, align 8
  %11 = load %struct.block*, %struct.block** %4, align 8
  %12 = icmp ugt %struct.block* %10, %11
  br i1 %12, label %13, label %19

13:                                               ; preds = %9
  %14 = load %struct.block*, %struct.block** %3, align 8
  %15 = load %struct.block*, %struct.block** %4, align 8
  %16 = getelementptr inbounds %struct.block, %struct.block* %15, i32 0, i32 0
  %17 = load %struct.block*, %struct.block** %16, align 8
  %18 = icmp ult %struct.block* %14, %17
  br label %19

19:                                               ; preds = %13, %9
  %20 = phi i1 [ false, %9 ], [ %18, %13 ]
  %21 = xor i1 %20, true
  br i1 %21, label %22, label %44

22:                                               ; preds = %19
  %23 = load %struct.block*, %struct.block** %4, align 8
  %24 = load %struct.block*, %struct.block** %4, align 8
  %25 = getelementptr inbounds %struct.block, %struct.block* %24, i32 0, i32 0
  %26 = load %struct.block*, %struct.block** %25, align 8
  %27 = icmp uge %struct.block* %23, %26
  br i1 %27, label %28, label %39

28:                                               ; preds = %22
  %29 = load %struct.block*, %struct.block** %3, align 8
  %30 = load %struct.block*, %struct.block** %4, align 8
  %31 = icmp ugt %struct.block* %29, %30
  br i1 %31, label %38, label %32

32:                                               ; preds = %28
  %33 = load %struct.block*, %struct.block** %3, align 8
  %34 = load %struct.block*, %struct.block** %4, align 8
  %35 = getelementptr inbounds %struct.block, %struct.block* %34, i32 0, i32 0
  %36 = load %struct.block*, %struct.block** %35, align 8
  %37 = icmp ult %struct.block* %33, %36
  br i1 %37, label %38, label %39

38:                                               ; preds = %32, %28
  br label %44

39:                                               ; preds = %32, %22
  br label %40

40:                                               ; preds = %39
  %41 = load %struct.block*, %struct.block** %4, align 8
  %42 = getelementptr inbounds %struct.block, %struct.block* %41, i32 0, i32 0
  %43 = load %struct.block*, %struct.block** %42, align 8
  store %struct.block* %43, %struct.block** %4, align 8
  br label %9

44:                                               ; preds = %38, %19
  %45 = load %struct.block*, %struct.block** %3, align 8
  %46 = load %struct.block*, %struct.block** %3, align 8
  %47 = getelementptr inbounds %struct.block, %struct.block* %46, i32 0, i32 1
  %48 = load i32, i32* %47, align 8
  %49 = sext i32 %48 to i64
  %50 = getelementptr inbounds %struct.block, %struct.block* %45, i64 %49
  %51 = load %struct.block*, %struct.block** %4, align 8
  %52 = getelementptr inbounds %struct.block, %struct.block* %51, i32 0, i32 0
  %53 = load %struct.block*, %struct.block** %52, align 8
  %54 = icmp eq %struct.block* %50, %53
  br i1 %54, label %55, label %72

55:                                               ; preds = %44
  %56 = load %struct.block*, %struct.block** %4, align 8
  %57 = getelementptr inbounds %struct.block, %struct.block* %56, i32 0, i32 0
  %58 = load %struct.block*, %struct.block** %57, align 8
  %59 = getelementptr inbounds %struct.block, %struct.block* %58, i32 0, i32 1
  %60 = load i32, i32* %59, align 8
  %61 = load %struct.block*, %struct.block** %3, align 8
  %62 = getelementptr inbounds %struct.block, %struct.block* %61, i32 0, i32 1
  %63 = load i32, i32* %62, align 8
  %64 = add nsw i32 %63, %60
  store i32 %64, i32* %62, align 8
  %65 = load %struct.block*, %struct.block** %4, align 8
  %66 = getelementptr inbounds %struct.block, %struct.block* %65, i32 0, i32 0
  %67 = load %struct.block*, %struct.block** %66, align 8
  %68 = getelementptr inbounds %struct.block, %struct.block* %67, i32 0, i32 0
  %69 = load %struct.block*, %struct.block** %68, align 8
  %70 = load %struct.block*, %struct.block** %3, align 8
  %71 = getelementptr inbounds %struct.block, %struct.block* %70, i32 0, i32 0
  store %struct.block* %69, %struct.block** %71, align 8
  br label %78

72:                                               ; preds = %44
  %73 = load %struct.block*, %struct.block** %4, align 8
  %74 = getelementptr inbounds %struct.block, %struct.block* %73, i32 0, i32 0
  %75 = load %struct.block*, %struct.block** %74, align 8
  %76 = load %struct.block*, %struct.block** %3, align 8
  %77 = getelementptr inbounds %struct.block, %struct.block* %76, i32 0, i32 0
  store %struct.block* %75, %struct.block** %77, align 8
  br label %78

78:                                               ; preds = %72, %55
  %79 = load %struct.block*, %struct.block** %4, align 8
  %80 = load %struct.block*, %struct.block** %4, align 8
  %81 = getelementptr inbounds %struct.block, %struct.block* %80, i32 0, i32 1
  %82 = load i32, i32* %81, align 8
  %83 = sext i32 %82 to i64
  %84 = getelementptr inbounds %struct.block, %struct.block* %79, i64 %83
  %85 = load %struct.block*, %struct.block** %3, align 8
  %86 = icmp eq %struct.block* %84, %85
  br i1 %86, label %87, label %100

87:                                               ; preds = %78
  %88 = load %struct.block*, %struct.block** %3, align 8
  %89 = getelementptr inbounds %struct.block, %struct.block* %88, i32 0, i32 1
  %90 = load i32, i32* %89, align 8
  %91 = load %struct.block*, %struct.block** %4, align 8
  %92 = getelementptr inbounds %struct.block, %struct.block* %91, i32 0, i32 1
  %93 = load i32, i32* %92, align 8
  %94 = add nsw i32 %93, %90
  store i32 %94, i32* %92, align 8
  %95 = load %struct.block*, %struct.block** %3, align 8
  %96 = getelementptr inbounds %struct.block, %struct.block* %95, i32 0, i32 0
  %97 = load %struct.block*, %struct.block** %96, align 8
  %98 = load %struct.block*, %struct.block** %4, align 8
  %99 = getelementptr inbounds %struct.block, %struct.block* %98, i32 0, i32 0
  store %struct.block* %97, %struct.block** %99, align 8
  br label %104

100:                                              ; preds = %78
  %101 = load %struct.block*, %struct.block** %3, align 8
  %102 = load %struct.block*, %struct.block** %4, align 8
  %103 = getelementptr inbounds %struct.block, %struct.block* %102, i32 0, i32 0
  store %struct.block* %101, %struct.block** %103, align 8
  br label %104

104:                                              ; preds = %100, %87
  %105 = load %struct.block*, %struct.block** %4, align 8
  store %struct.block* %105, %struct.block** @_ZL5freep, align 8
  ret void
}

attributes #0 = { noinline optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #2 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.module.flags = !{!0}
!llvm.ident = !{!1}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{!"clang version 10.0.0-4ubuntu1 "}
